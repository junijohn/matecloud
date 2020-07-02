package vip.mate.system.service;

import com.alicp.jetcache.anno.Cached;
import vip.mate.core.common.api.Result;
import vip.mate.system.entity.SysDict;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 字典表 服务类
 * </p>
 *
 * @author xuzf
 * @since 2020-07-01
 */
public interface ISysDictService extends IService<SysDict> {

    @Cached(name="sysDictService.getValue", expire = 3600)
    Result<String> getValue(String code, String dictKey);

    @Cached(name="sysDictService.getList", expire = 3600)
    Result<List<SysDict>> getList(String code);

}