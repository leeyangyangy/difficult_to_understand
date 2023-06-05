package xyz.leeyangy.school.modular.system.controller;


import org.springframework.web.bind.annotation.*;
import xyz.leeyangy.school.framework.response.ResponseData;
import xyz.leeyangy.school.modular.system.entity.HealthReport;
import xyz.leeyangy.school.modular.system.service.HealthReportService;

import javax.annotation.Resource;

/**
 * <p>
 * 健康信息上报 前端控制器
 * </p>
 *
 * @author liyangyang
 * @since 2023-05-02
 */
@RestController
@RequestMapping("/system/health")
public class HealthReportController {

    @Resource
    HealthReportService healthReportService;

    /***
     * @Param: [healthReport]
     * @return: org.dragonwings.school.framework.response.ResponseData
     * @Author: liyangyang
     * @Date: 2023/5/7 20:11
     * @Description: 健康信息上报接口
     */
    @PostMapping("/healthReport")
    public ResponseData healthReport(@RequestBody HealthReport healthReport) {
        return healthReportService.addHealthReport(healthReport);
    }

    /***
     * @Param: [userId, hid]
     * @return: org.dragonwings.school.framework.response.ResponseData
     * @Author: liyangyang
     * @Date: 2023/5/7 20:14
     * @Description: 该接口是复用
     *
     *      hid查询自己的记录id，如果为空默认给自己全部数据
     *      hid不为空，查询指定记录
     */
    @GetMapping("/getHealthRecord/{userId}/{hid}")
    public ResponseData getHealthRecord(@PathVariable Long userId, @PathVariable Long hid) {

        return healthReportService.getHealthRecordDetail(userId,hid);
    }

}
