package com.netflix.contentservice.model;

// Pending -> Uploaded -> Encoding -> Encoded -> Ready or Failed

public enum VideoStatus {
    PENDING,
    UPLOADED,
    ENCODING,
    ENCODED,
    READY,
    FAILED
}
