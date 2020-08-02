USE [master]
GO
/****** Object:  Database [QuanLyChoThueXe]    Script Date: 8/2/2020 3:49:27 PM ******/
CREATE DATABASE [QuanLyChoThueXe]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'QuanLyChoThueXe', FILENAME = N'D:\Study\Aptech\SQL_20191209\DB\QuanLyChoThueXe.mdf' , SIZE = 3072KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'QuanLyChoThueXe_log', FILENAME = N'D:\Study\Aptech\SQL_20191209\DB\QuanLyChoThueXe_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [QuanLyChoThueXe] SET COMPATIBILITY_LEVEL = 120
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [QuanLyChoThueXe].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [QuanLyChoThueXe] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [QuanLyChoThueXe] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [QuanLyChoThueXe] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [QuanLyChoThueXe] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [QuanLyChoThueXe] SET ARITHABORT OFF 
GO
ALTER DATABASE [QuanLyChoThueXe] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [QuanLyChoThueXe] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [QuanLyChoThueXe] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [QuanLyChoThueXe] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [QuanLyChoThueXe] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [QuanLyChoThueXe] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [QuanLyChoThueXe] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [QuanLyChoThueXe] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [QuanLyChoThueXe] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [QuanLyChoThueXe] SET  DISABLE_BROKER 
GO
ALTER DATABASE [QuanLyChoThueXe] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [QuanLyChoThueXe] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [QuanLyChoThueXe] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [QuanLyChoThueXe] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [QuanLyChoThueXe] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [QuanLyChoThueXe] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [QuanLyChoThueXe] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [QuanLyChoThueXe] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [QuanLyChoThueXe] SET  MULTI_USER 
GO
ALTER DATABASE [QuanLyChoThueXe] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [QuanLyChoThueXe] SET DB_CHAINING OFF 
GO
ALTER DATABASE [QuanLyChoThueXe] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [QuanLyChoThueXe] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
ALTER DATABASE [QuanLyChoThueXe] SET DELAYED_DURABILITY = DISABLED 
GO
USE [QuanLyChoThueXe]
GO
/****** Object:  Table [dbo].[HOPDONG]    Script Date: 8/2/2020 3:49:27 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[HOPDONG](
	[MaHD] [int] NOT NULL,
	[NgayLap] [datetime] NULL,
	[SoCMND] [int] NULL,
	[ThoiGianBatDauHopDong] [datetime] NULL,
	[ThoiGianKetThucHopDong] [datetime] NULL,
	[DiaDiemNhanXe] [nvarchar](50) NULL,
	[DiaDiemTraXe] [nvarchar](50) NULL,
	[GhiChu] [nvarchar](50) NULL,
	[MaLoaiXe] [varchar](50) NULL,
	[MaPK] [varchar](50) NULL,
	[MaThanhToan] [varchar](50) NULL,
	[DatCoc] [nvarchar](50) NULL,
 CONSTRAINT [PK_HOPDONG] PRIMARY KEY CLUSTERED 
(
	[MaHD] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[KHACHHANG]    Script Date: 8/2/2020 3:49:27 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KHACHHANG](
	[SoCMND] [int] NOT NULL,
	[HoTen] [nvarchar](50) NULL,
	[NamSinh] [date] NULL,
	[SoGPLX] [int] NULL,
	[GhiChu] [nvarchar](50) NULL,
 CONSTRAINT [PK_KHACHHANG] PRIMARY KEY CLUSTERED 
(
	[SoCMND] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[LOAIPHUKIEN]    Script Date: 8/2/2020 3:49:27 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[LOAIPHUKIEN](
	[MaLoaiPK] [varchar](50) NOT NULL,
	[TenLoaiPK] [nvarchar](50) NULL,
 CONSTRAINT [PK_LOAIPHUKIEN] PRIMARY KEY CLUSTERED 
(
	[MaLoaiPK] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[LOAIXE]    Script Date: 8/2/2020 3:49:27 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[LOAIXE](
	[MaLoaiXe] [varchar](50) NOT NULL,
	[TenLoaiXe] [nvarchar](50) NULL,
 CONSTRAINT [PK_LOAIXE] PRIMARY KEY CLUSTERED 
(
	[MaLoaiXe] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[PHUKIEN]    Script Date: 8/2/2020 3:49:27 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[PHUKIEN](
	[MaPK] [varchar](50) NOT NULL,
	[TenPK] [nvarchar](50) NULL,
	[TinhTrangPK] [nvarchar](50) NULL,
	[ThoiGianBatDauTinhTrang] [datetime] NULL,
	[ThoiGianKetThucTinhTrang] [datetime] NULL,
	[MaLoaiPK] [varchar](50) NULL,
 CONSTRAINT [PK_PHUKIEN] PRIMARY KEY CLUSTERED 
(
	[MaPK] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Tien]    Script Date: 8/2/2020 3:49:27 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Tien](
	[MaThanhToan] [varchar](50) NOT NULL,
	[TienThueXe] [decimal](18, 2) NULL,
	[TienSuaChua] [decimal](18, 2) NULL,
	[TongTien] [decimal](18, 2) NULL,
	[GhiChu] [nvarchar](50) NULL,
 CONSTRAINT [PK_Tien] PRIMARY KEY CLUSTERED 
(
	[MaThanhToan] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Xe]    Script Date: 8/2/2020 3:49:27 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Xe](
	[MaXe] [varchar](50) NOT NULL,
	[TenXe] [nvarchar](50) NULL,
	[SoKhung] [nvarchar](50) NULL,
	[SoMay] [nvarchar](50) NULL,
	[PhanKhoi] [int] NULL,
	[Hang] [nvarchar](50) NULL,
	[SoCho] [int] NULL,
	[GiaThueXeTheoGio] [decimal](18, 2) NULL,
	[GiaThueXeTheoNgay] [decimal](18, 2) NULL,
	[GiaThueXeTheoThang] [decimal](18, 2) NULL,
	[TienPhat] [decimal](18, 2) NULL,
	[TinhTrangXe] [nvarchar](50) NULL,
	[ThoiGianBatDauTinhTrang] [datetime] NULL,
	[ThoiGianKetThucTinhTrang] [datetime] NULL,
	[MaLoaiXe] [varchar](50) NULL,
 CONSTRAINT [PK_Xe] PRIMARY KEY CLUSTERED 
(
	[MaXe] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
ALTER TABLE [dbo].[HOPDONG]  WITH CHECK ADD  CONSTRAINT [FK_HOPDONG_KHACHHANG] FOREIGN KEY([SoCMND])
REFERENCES [dbo].[KHACHHANG] ([SoCMND])
GO
ALTER TABLE [dbo].[HOPDONG] CHECK CONSTRAINT [FK_HOPDONG_KHACHHANG]
GO
ALTER TABLE [dbo].[HOPDONG]  WITH CHECK ADD  CONSTRAINT [FK_HOPDONG_LOAIXE] FOREIGN KEY([MaLoaiXe])
REFERENCES [dbo].[LOAIXE] ([MaLoaiXe])
GO
ALTER TABLE [dbo].[HOPDONG] CHECK CONSTRAINT [FK_HOPDONG_LOAIXE]
GO
ALTER TABLE [dbo].[HOPDONG]  WITH CHECK ADD  CONSTRAINT [FK_HOPDONG_PHUKIEN] FOREIGN KEY([MaPK])
REFERENCES [dbo].[PHUKIEN] ([MaPK])
GO
ALTER TABLE [dbo].[HOPDONG] CHECK CONSTRAINT [FK_HOPDONG_PHUKIEN]
GO
ALTER TABLE [dbo].[HOPDONG]  WITH CHECK ADD  CONSTRAINT [FK_HOPDONG_Tien] FOREIGN KEY([MaThanhToan])
REFERENCES [dbo].[Tien] ([MaThanhToan])
GO
ALTER TABLE [dbo].[HOPDONG] CHECK CONSTRAINT [FK_HOPDONG_Tien]
GO
ALTER TABLE [dbo].[PHUKIEN]  WITH CHECK ADD  CONSTRAINT [FK_PHUKIEN_LOAIPHUKIEN] FOREIGN KEY([MaLoaiPK])
REFERENCES [dbo].[LOAIPHUKIEN] ([MaLoaiPK])
GO
ALTER TABLE [dbo].[PHUKIEN] CHECK CONSTRAINT [FK_PHUKIEN_LOAIPHUKIEN]
GO
ALTER TABLE [dbo].[Xe]  WITH CHECK ADD  CONSTRAINT [FK_Xe_LOAIXE1] FOREIGN KEY([MaLoaiXe])
REFERENCES [dbo].[LOAIXE] ([MaLoaiXe])
GO
ALTER TABLE [dbo].[Xe] CHECK CONSTRAINT [FK_Xe_LOAIXE1]
GO
USE [master]
GO
ALTER DATABASE [QuanLyChoThueXe] SET  READ_WRITE 
GO
