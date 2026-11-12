.class public Lnj;
.super Lhd;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final c:Lpa;

.field public final d:Lhg3;

.field public e:Ljava/lang/String;

.field public f:Lk03;


# direct methods
.method public constructor <init>(Landroid/app/Application;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lhd;-><init>(Landroid/app/Application;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lpa;

    .line 5
    .line 6
    const/16 v0, 0xc

    .line 7
    .line 8
    invoke-direct {p1, v0}, Lpa;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lnj;->c:Lpa;

    .line 12
    .line 13
    new-instance p1, Lhg3;

    .line 14
    .line 15
    const/16 v0, 0xf

    .line 16
    .line 17
    invoke-direct {p1, v0}, Lhg3;-><init>(I)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lnj;->d:Lhg3;

    .line 21
    .line 22
    return-void
.end method
