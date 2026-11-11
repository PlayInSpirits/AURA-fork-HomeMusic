.class public Lse2;
.super Lhd;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final c:Lpz1;

.field public d:Lcom/eddyizm/tempus/model/Server;


# direct methods
.method public constructor <init>(Landroid/app/Application;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lhd;-><init>(Landroid/app/Application;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lse2;->d:Lcom/eddyizm/tempus/model/Server;

    .line 6
    .line 7
    new-instance p1, Lpz1;

    .line 8
    .line 9
    const/16 v0, 0x14

    .line 10
    .line 11
    invoke-direct {p1, v0}, Lpz1;-><init>(I)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lse2;->c:Lpz1;

    .line 15
    .line 16
    return-void
.end method
