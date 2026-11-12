.class public Lob4;
.super Lhd;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final c:Lhh3;

.field public final d:Lom0;

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
    iput-object p1, p0, Lob4;->e:Lk03;

    .line 11
    .line 12
    new-instance p1, Lhh3;

    .line 13
    .line 14
    const/16 v0, 0x16

    .line 15
    .line 16
    invoke-direct {p1, v0}, Lhh3;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lob4;->c:Lhh3;

    .line 20
    .line 21
    new-instance p1, Lom0;

    .line 22
    .line 23
    const/4 v0, 0x5

    .line 24
    invoke-direct {p1, v0}, Lom0;-><init>(I)V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Lob4;->d:Lom0;

    .line 28
    .line 29
    return-void
.end method
