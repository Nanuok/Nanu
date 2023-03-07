package com.grow.growRequest.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "grower")
@Data
public class Grow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String SendTo;


    private String qualityStandard;
    @Column(name = "asset_vertical_id", nullable=false, length = 45)
    private long assetVerticalId;
    private String category;
    private String assetType;

    private String modelId;
    @Column(name = "price", nullable=false, length = 45)
    private long price;
    @Column(name = "qty", nullable=false, length = 45)
    private int qty;
}
