/**
 * 
 * APDPlat - Application Product Development Platform
 * Copyright (c) 2013, 杨尚川
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */

package com.apdplat.module.security.service;

import com.apdplat.module.security.model.User;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;

/**
 *
 * @author ysc
 */
public class PasswordEncoder {
    public static String encode(String password,User user){
        return new Md5PasswordEncoder().encodePassword(password,user.getMetaData());
    }
}