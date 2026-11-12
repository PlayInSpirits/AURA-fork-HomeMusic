.class public final Lta4;
.super Lhd;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final c:Lpz1;

.field public final d:Lt24;


# direct methods
.method public constructor <init>(Landroid/app/Application;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Lhd;-><init>(Landroid/app/Application;)V

    .line 5
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
    iput-object p1, p0, Lta4;->c:Lpz1;

    .line 15
    .line 16
    iget-object p1, p1, Lpz1;->o:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p1, Lna4;

    .line 19
    .line 20
    iget-object p1, p1, Lna4;->n:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p1, Ls24;

    .line 23
    .line 24
    invoke-virtual {p1}, Ls24;->i()Ls12;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const-string v0, "server"

    .line 29
    .line 30
    filled-new-array {v0}, [Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    new-instance v1, Lo54;

    .line 35
    .line 36
    const/16 v2, 0xe

    .line 37
    .line 38
    invoke-direct {v1, v2}, Lo54;-><init>(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v0, v1}, Ls12;->a([Ljava/lang/String;Lif1;)Lt24;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iput-object p1, p0, Lta4;->d:Lt24;

    .line 46
    .line 47
    return-void
.end method
