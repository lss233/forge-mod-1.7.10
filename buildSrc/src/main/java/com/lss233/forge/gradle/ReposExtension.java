package com.lss233.forge.gradle;

import org.gradle.api.Project;

public class ReposExtension {
    private String mcJsonUrl = "http://s3.amazonaws.com/Minecraft.Download/versions/{MC_VERSION}/{MC_VERSION}.json";
    private String mcJarUrl = "http://s3.amazonaws.com/Minecraft.Download/versions/{MC_VERSION}/{MC_VERSION}.jar";
    private String mcServerUrl = "http://s3.amazonaws.com/Minecraft.Download/versions/{MC_VERSION}/minecraft_server.{MC_VERSION}.jar";
    private String assetsUrl = "http://resources.download.minecraft.net";
    private String assetsIndexUrl = "https://s3.amazonaws.com/Minecraft.Download/indexes/{ASSET_INDEX}.json";

    public ReposExtension() {
    }
    public ReposExtension(Project project) {
        System.out.println("project = " + project);
    }

    public static ReposExtension getInstance(Project project) {
        return project.getExtensions().create("repos", ReposExtension.class);
    }

    public String getMcJsonUrl() {
        return mcJsonUrl;
    }

    public void setMcJsonUrl(String mcJsonUrl) {
        this.mcJsonUrl = mcJsonUrl;
    }

    public String getMcJarUrl() {
        return mcJarUrl;
    }

    public void setMcJarUrl(String mcJarUrl) {
        this.mcJarUrl = mcJarUrl;
    }

    public String getMcServerUrl() {
        return mcServerUrl;
    }

    public void setMcServerUrl(String mcServerUrl) {
        this.mcServerUrl = mcServerUrl;
    }

    public String getAssetsUrl() {
        return assetsUrl;
    }

    public void setAssetsUrl(String assetsUrl) {
        this.assetsUrl = assetsUrl;
    }

    public String getAssetsIndexUrl() {
        return assetsIndexUrl;
    }

    public void setAssetsIndexUrl(String assetsIndexUrl) {
        this.assetsIndexUrl = assetsIndexUrl;
    }
}
