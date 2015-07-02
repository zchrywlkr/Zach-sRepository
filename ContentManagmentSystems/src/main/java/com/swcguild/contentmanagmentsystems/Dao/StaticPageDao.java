/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.contentmanagmentsystems.Dao;

import com.swcguild.contentmanagmentsystems.dto.StaticPage;
import java.util.List;

/**
 *
 * @author apprentice
 */
public interface StaticPageDao {
    public StaticPage getPage(int id);
    public void addPage(StaticPage page);
    public void editPage(StaticPage page);
    public StaticPage setIndex(StaticPage page,int index);
    public List<StaticPage> getAllStaticPage();
    public void updatePage(StaticPage page);
    public StaticPage selectPageByIndex(int index);
    public void deletePage(int id);
    
}
