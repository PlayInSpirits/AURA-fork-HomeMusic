.class public Ljn3;
.super Lhd;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final c:Lhh3;

.field public final d:Lk03;

.field public final e:Lk03;


# direct methods
.method public constructor <init>(Landroid/app/Application;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lhd;-><init>(Landroid/app/Application;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lk03;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p1, v0}, Lad2;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Ljn3;->d:Lk03;

    .line 11
    .line 12
    new-instance p1, Lk03;

    .line 13
    .line 14
    invoke-direct {p1, v0}, Lad2;-><init>(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Ljn3;->e:Lk03;

    .line 18
    .line 19
    new-instance p1, Lhh3;

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    invoke-direct {p1, v0}, Lhh3;-><init>(I)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Ljn3;->c:Lhh3;

    .line 26
    .line 27
    return-void
.end method
