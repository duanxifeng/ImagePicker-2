package com.lancewu.imagepicker.crop;

import android.app.Activity;
import android.net.Uri;

import java.io.File;

/**
 * Created by LanceWu on 2019/1/30.<br/>
 * 裁剪配置
 */
public class CropConfig {

    /**
     * 默认比例
     */
    public static final int DEFAULT_ASPECT_X = 1;
    /**
     * 默认比例
     */
    public static final int DEFAULT_ASPECT_Y = 1;
    /**
     * 默认输出大小
     */
    public static final int DEFAULT_OUTPUT_X = 200;
    /**
     * 默认输出大小
     */
    public static final int DEFAULT_OUTPUT_Y = 200;

    // 来源页面
    private Activity mActivity;
    // 请求码
    private int mRequestCode;
    // 输入的图片文件
    private File mInputImageFile;
    // 裁剪后输出的图片文件
    private File mOutputImageFile;
    // 输入的图片Uri
    private Uri mInputImageUri;
    // 比例x
    private int mAspectX = DEFAULT_ASPECT_X;
    // 比例y
    private int mAspectY = DEFAULT_ASPECT_Y;
    // 裁剪大小
    private int mOutputX = DEFAULT_OUTPUT_X;
    // 裁剪大小
    private int mOutputY = DEFAULT_OUTPUT_Y;
    // 是否需要默认的人脸识别（如果支持的话）
    private boolean mFaceDetection;

    public Activity getActivity() {
        return mActivity;
    }

    public int getRequestCode() {
        return mRequestCode;
    }

    public void setActivity(Activity activity) {
        mActivity = activity;
    }

    public void setRequestCode(int requestCode) {
        mRequestCode = requestCode;
    }

    public File getInputImageFile() {
        return mInputImageFile;
    }

    public void setInputImageFile(File inputImageFile) {
        mInputImageFile = inputImageFile;
    }

    public File getOutputImageFile() {
        return mOutputImageFile;
    }

    public void setOutputImageFile(File outputImageFile) {
        mOutputImageFile = outputImageFile;
    }

    public Uri getInputImageUri() {
        return mInputImageUri;
    }

    public void setInputImageUri(Uri inputImageUri) {
        mInputImageUri = inputImageUri;
    }

    public int getOutputX() {
        return mOutputX;
    }

    public void setOutputX(int outputX) {
        mOutputX = outputX;
    }

    public int getOutputY() {
        return mOutputY;
    }

    public void setOutputY(int outputY) {
        mOutputY = outputY;
    }

    public int getAspectX() {
        return mAspectX;
    }

    public void setAspectX(int aspectX) {
        mAspectX = aspectX;
    }

    public int getAspectY() {
        return mAspectY;
    }

    public void setAspectY(int aspectY) {
        mAspectY = aspectY;
    }

    public boolean isFaceDetection() {
        return mFaceDetection;
    }

    public void setFaceDetection(boolean faceDetection) {
        mFaceDetection = faceDetection;
    }
}
