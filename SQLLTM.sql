create database [quanlysinhvien]
USE [quanlysinhvien]
GO
/****** Object:  Table [dbo].[SinhVien]    Script Date: 12/08/2022 5:22:03 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SinhVien](
	[HoTen] [nvarchar](255) NULL,
	[MSSV] [nvarchar](255) NULL,
	[DiemToan] [float] NULL,
	[DiemVan] [float] NULL,
	[DiemTA] [float] NULL
) ON [PRIMARY]
GO
