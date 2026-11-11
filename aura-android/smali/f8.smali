.class public Lf8;
.super Lhd;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final c:Lrv2;

.field public d:Ljava/lang/String;

.field public e:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

.field public f:Ljava/util/ArrayList;

.field public g:Lk03;

.field public final h:I


# direct methods
.method public constructor <init>(Landroid/app/Application;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lhd;-><init>(Landroid/app/Application;)V

    .line 2
    .line 3
    .line 4
    const/16 p1, 0x1f4

    .line 5
    .line 6
    iput p1, p0, Lf8;->h:I

    .line 7
    .line 8
    new-instance p1, Lrv2;

    .line 9
    .line 10
    const/16 v0, 0x1b

    .line 11
    .line 12
    invoke-direct {p1, v0}, Lrv2;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lf8;->c:Lrv2;

    .line 16
    .line 17
    return-void
.end method
