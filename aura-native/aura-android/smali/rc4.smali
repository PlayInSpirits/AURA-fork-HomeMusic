.class public Lrc4;
.super Lhd;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final c:Lhh3;

.field public d:Lcom/eddyizm/tempus/subsonic/models/Share;


# direct methods
.method public constructor <init>(Landroid/app/Application;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lhd;-><init>(Landroid/app/Application;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lhh3;

    .line 5
    .line 6
    const/16 v0, 0x1b

    .line 7
    .line 8
    invoke-direct {p1, v0}, Lhh3;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lrc4;->c:Lhh3;

    .line 12
    .line 13
    return-void
.end method
