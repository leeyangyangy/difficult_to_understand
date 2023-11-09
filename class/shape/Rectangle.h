//
// Created by leeyangy on 2023/11/8.
//

#ifndef SERVER_RECTANGLE_H
#define SERVER_RECTANGLE_H


#include "Shape.h"
#include "PaintCost.h"

class Rectangle : public Shape ,public PaintCost{
public:
    int getArea(){
        return width * height;
    }
};


#endif //SERVER_RECTANGLE_H