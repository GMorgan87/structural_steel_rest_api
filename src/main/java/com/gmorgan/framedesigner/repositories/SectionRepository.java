package com.gmorgan.framedesigner.repositories;

import com.gmorgan.framedesigner.Models.Section;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SectionRepository extends JpaRepository<Section, Long> {

    List<Section> findAllByDescContains (String desc);
    List<Section> findAllByIyyGreaterThanAndZyyGreaterThanAndDescContainsIgnoreCase(double iyy, double zyy, String desc);
    List<Section> findAllByIxxGreaterThanAndZxxGreaterThanAndDescContainsIgnoreCase(double ixx, double zxx, String desc);
    Section findFirstByIyyGreaterThanAndZyyGreaterThanAndDescContainsIgnoreCase(double iyy, double zyy, String desc);
    Section findFirstByIxxGreaterThanAndZxxGreaterThanAndDescContainsIgnoreCase(double ixx, double zxx, String desc);

//    List<Section> findAllByIxxGreaterThanAndZxxGreaterThanAndIyyGreaterThanAndZyyGreaterThanAndXGreaterThanAndDescContainsIgnoreCase(double ixx, double zxx, double iyy, double zyy, int x, String desc);
//    List<Section> findAllByIyyGreaterThanAndZyyGreaterThanAndCsaGreaterThanAndDescContainsIgnoreCase(double iyy, double zyy, double csa, String desc);
//    List<Section> findAllByIyyGreaterThanAndZyyGreaterThanAndXGreaterThanAndYGreaterThanAndDescContainsIgnoreCase(double iyy, double zyy, int x, int y, String desc);
}
