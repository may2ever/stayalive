package com.stay.alive.auction.reverse.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.stay.alive.accommodation.vo.Accommodation;
import com.stay.alive.auction.reverse.vo.ReverseauctionTender;
import com.stay.alive.company.vo.Company;
import com.stay.alive.guestroom.vo.GuestRoom;

@Mapper
public interface ReverseauctionTenderMapper {
	// 역경매 입찰 등록
	int insertReverseauctionTender(ReverseauctionTender reverseauctionTender);
	// 역경매 내 입찰목록 조회
	List<ReverseauctionTender> selectTenderListForOneReverseauction(int reverseauctionNo);
	// 역경매 입찰 상세조회
	ReverseauctionTender selectReverseauctionTenderOne(int reverseauctionTenderNo);
	// 역경매 입찰 수정
	int updateReverseauctionTender(ReverseauctionTender reverseauctionTender);
	// 역경매 입찰 삭제
	int deleteReverseauctionTenderOne(int reverseauctionTenderNo);
	// 역경매 내 입찰목록 전체삭제
	int deleteReverseauctionTender(int reverseauctionNo);
	// 입찰수 1 더하기
	int updateReverseauctionTenderCountUp(int reverseauctionNo);
	// 숙소 이미지 조회
	Accommodation selectTenderAccommodation(int accommodationNo);
	// 숙소 정보(No, Name) 조회 (id로)
	List<Accommodation> selectAccommodation(String memberId);
	// 객실 정보(No, Name) 조회 (숙소번호로)
	List<GuestRoom> selectGuestRooom(int accommodationNo);
	// 업체 정보(No, Name) 조회 (id로)
	Company selectCompany(String memberId);
	// 역경매입찰 카운트-1
	void updateReverseauctionTenderCountDown(int reverseauctionNo);
	// 역경매입찰 조회 (memberId로)
	List<ReverseauctionTender> selectTenderListById(ReverseauctionTender tender);
}
