package com.demo.patternfactory.abstractfactory;

/**
 * @author Administrator
 */
public interface CourseAbstractFactory {

    INote LearnNote();

    IVideo LearnVideo();

}
