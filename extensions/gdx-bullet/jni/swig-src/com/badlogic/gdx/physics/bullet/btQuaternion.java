/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.utils.SharedLibraryLoader;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;

public class btQuaternion {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public btQuaternion(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btQuaternion obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btQuaternion(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  static {
    new SharedLibraryLoader().load("gdx-bullet");
  }

  public btQuaternion() {
    this(gdxBulletJNI.new_btQuaternion__SWIG_0(), true);
  }

  public btQuaternion(float x, float y, float z, float w) {
    this(gdxBulletJNI.new_btQuaternion__SWIG_1(x, y, z, w), true);
  }

  public btQuaternion(Vector3 axis, float angle) {
    this(gdxBulletJNI.new_btQuaternion__SWIG_2(axis, angle), true);
  }

  public btQuaternion(float yaw, float pitch, float roll) {
    this(gdxBulletJNI.new_btQuaternion__SWIG_3(yaw, pitch, roll), true);
  }

  public void setRotation(Vector3 axis, float angle) {
    gdxBulletJNI.btQuaternion_setRotation(swigCPtr, this, axis, angle);
  }

  public void setEuler(float yaw, float pitch, float roll) {
    gdxBulletJNI.btQuaternion_setEuler(swigCPtr, this, yaw, pitch, roll);
  }

  public void setEulerZYX(float yaw, float pitch, float roll) {
    gdxBulletJNI.btQuaternion_setEulerZYX(swigCPtr, this, yaw, pitch, roll);
  }

  public float dot(Quaternion q) {
    return gdxBulletJNI.btQuaternion_dot(swigCPtr, this, q);
  }

  public float length2() {
    return gdxBulletJNI.btQuaternion_length2(swigCPtr, this);
  }

  public float length() {
    return gdxBulletJNI.btQuaternion_length(swigCPtr, this);
  }

  public Quaternion normalize() {
	return gdxBulletJNI.btQuaternion_normalize(swigCPtr, this);
}

  public Quaternion normalized() {
	return gdxBulletJNI.btQuaternion_normalized(swigCPtr, this);
}

  public float angle(Quaternion q) {
    return gdxBulletJNI.btQuaternion_angle(swigCPtr, this, q);
  }

  public float getAngle() {
    return gdxBulletJNI.btQuaternion_getAngle(swigCPtr, this);
  }

  public Vector3 getAxis() {
	return gdxBulletJNI.btQuaternion_getAxis(swigCPtr, this);
}

  public Quaternion inverse() {
	return gdxBulletJNI.btQuaternion_inverse(swigCPtr, this);
}

  public Quaternion farthest(Quaternion qd) {
	return gdxBulletJNI.btQuaternion_farthest(swigCPtr, this, qd);
}

  public Quaternion nearest(Quaternion qd) {
	return gdxBulletJNI.btQuaternion_nearest(swigCPtr, this, qd);
}

  public Quaternion slerp(Quaternion q, float t) {
	return gdxBulletJNI.btQuaternion_slerp(swigCPtr, this, q, t);
}

  public static Quaternion getIdentity() {
	return gdxBulletJNI.btQuaternion_getIdentity();
}

  public float getW() {
    return gdxBulletJNI.btQuaternion_getW(swigCPtr, this);
  }

}