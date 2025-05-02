package com.pjor.qrcode.generator.ports;

public interface StoragePort {
    String uploadFile(byte[] fileDate, String fileName, String contentType);
}
