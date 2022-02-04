package com.dz_fs_dev.finance.liquidPoolMarkets.liquidPoolAsset;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * v1/liquid REST Service Controller.
 * 
 * @author DZ_FSDev
 * @since 17.0.1
 * @version 0.0.2
 */
@RestController
@RequestMapping("/v1/liquid/assets")
public class RESTController_v1_liquid_assets {
	@Autowired
	IAssetService assetSvc;
	
	@GetMapping
	public String get() {
		return "HI";
	}
	
	@GetMapping(value = "/list")
	public List<Asset> getAllAssets(){
		return assetSvc.getAllAssets();
	}
}