.class public final Lhs0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lp81;


# instance fields
.field public final n:Lp81;


# direct methods
.method public constructor <init>(Lp81;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lhs0;->n:Lp81;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lq81;Lvd0;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Ljx3;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lxl;->e:Lf01;

    .line 7
    .line 8
    iput-object v1, v0, Ljx3;->n:Ljava/lang/Object;

    .line 9
    .line 10
    new-instance v1, Lgs0;

    .line 11
    .line 12
    invoke-direct {v1, p0, v0, p1}, Lgs0;-><init>(Lhs0;Ljx3;Lq81;)V

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, Lhs0;->n:Lp81;

    .line 16
    .line 17
    invoke-interface {p0, v1, p2}, Lp81;->a(Lq81;Lvd0;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    sget-object p1, Lxe0;->n:Lxe0;

    .line 22
    .line 23
    if-ne p0, p1, :cond_0

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_0
    sget-object p0, Lj15;->a:Lj15;

    .line 27
    .line 28
    return-object p0
.end method
