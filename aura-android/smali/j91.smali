.class public final Lj91;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lp81;


# instance fields
.field public final synthetic n:Lp81;

.field public final synthetic o:Landroidx/work/impl/WorkDatabase_Impl;

.field public final synthetic p:Lx;


# direct methods
.method public constructor <init>(Lp81;Landroidx/work/impl/WorkDatabase_Impl;Lx;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lj91;->n:Lp81;

    .line 5
    .line 6
    iput-object p2, p0, Lj91;->o:Landroidx/work/impl/WorkDatabase_Impl;

    .line 7
    .line 8
    iput-object p3, p0, Lj91;->p:Lx;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Lq81;Lvd0;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, Lz81;

    .line 2
    .line 3
    iget-object v1, p0, Lj91;->o:Landroidx/work/impl/WorkDatabase_Impl;

    .line 4
    .line 5
    iget-object v2, p0, Lj91;->p:Lx;

    .line 6
    .line 7
    invoke-direct {v0, p1, v1, v2}, Lz81;-><init>(Lq81;Landroidx/work/impl/WorkDatabase_Impl;Lx;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lj91;->n:Lp81;

    .line 11
    .line 12
    invoke-interface {p0, v0, p2}, Lp81;->a(Lq81;Lvd0;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    sget-object p1, Lxe0;->n:Lxe0;

    .line 17
    .line 18
    if-ne p0, p1, :cond_0

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_0
    sget-object p0, Lj15;->a:Lj15;

    .line 22
    .line 23
    return-object p0
.end method
