package com.xinhong.buildcontrol.shiro;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import javax.annotation.Resource;
import java.util.HashSet;
import java.util.Set;

public class UserRealm  {

//    private final static Logger logger = LoggerFactory.getLogger(UserRealm.class);
//
//    @Resource
//   // private HumanAdminService adminService;
//
//
//
//
////    @Override
////    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
////        System.out.println("————权限认证————");
////        Object principal = SecurityUtils.getSubject().getPrincipal();
////        HumanAdmin user = (HumanAdmin) principal;
////        String username = user.getEmail();
////        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
////        //1管理员2用户3游客
////        boolean adminF = false;
////        boolean userF = false;
////        boolean touristF = false;
////        //获得该用户角色
////        List<HumanRole> humanRoles = roleService.searchRolesByUserIdOrUserName(null, username);
////        Set<String> set = new HashSet<>();
////        if(humanRoles!=null&&humanRoles.size()>0){
////            for(HumanRole role:humanRoles){
////                Integer type = role.getType();
////                if(type!=null&&type==1){
////                    adminF=true;
////                }else if(type!=null&&type==2){
////                    userF = true;
////                }else if(type!=null&&type==2){
////                    touristF = true;
////                }
////
////            }
////        }
////        if(adminF){
////            set.add("admin");
////            set.add("user");
////        }else if(userF){
////            set.add("user");
////        }else if(touristF){
////            set.add("guest");
////        }
////        //需要将 role 封装到 Set 作为 info.setRoles() 的参数
////        //设置该用户拥有的角色
////        info.setRoles(set);
////        return info;
////
////    }
//
//    @Override
//    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
//        System.out.println("————权限认证————");
//        Object principal = SecurityUtils.getSubject().getPrincipal();
//        HumanAdmin user = (HumanAdmin) principal;
//        String username = user.getEmail();
//        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
//        //1管理员2用户3游客
//        Set<String> set = new HashSet<>();
//        set.add("admin");
//        set.add("user");
//        set.add("guest");
//        //需要将 role 封装到 Set 作为 info.setRoles() 的参数
//        //设置该用户拥有的角色
//        info.setRoles(set);
//        return info;
//
//    }
//
//    @Override
//    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
//        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
//        logger.info("用户验证执行 : "+token.getUsername());
//        EntityWrapper<HumanAdmin> entityWrapper = new EntityWrapper<HumanAdmin>();
//        entityWrapper.where("email={0}",token.getUsername());
//        HumanAdmin humanAdmin = adminService.selectOne(entityWrapper);
//        if(humanAdmin==null){
//            logger.error("用户 { "+token.getUsername()+" } 不存在 ");
//            throw new AccountException("账户不存在");
//        }
//        if(humanAdmin.getIsDelete()==2){
//            logger.error("用户 { "+token.getUsername()+" } 被禁止登录 ");
//            throw new DisabledAccountException("账号已经禁止登录");
//        }
//        String salt = "xh9999";
//        SimpleHash simpleHash=new SimpleHash("MD5", humanAdmin.getPassword(), salt, 1);
//        return new SimpleAuthenticationInfo(humanAdmin,simpleHash.toString(),getName());
//    }

}
