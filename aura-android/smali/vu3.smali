.class public final Lvu3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lll4;
.implements Lp81;
.implements Ljg1;


# instance fields
.field public final synthetic n:Lnl4;


# direct methods
.method public constructor <init>(Lnl4;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lvu3;->n:Lnl4;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lq81;Lvd0;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lvu3;->n:Lnl4;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lnl4;->a(Lq81;Lvd0;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    sget-object p0, Lxe0;->n:Lxe0;

    .line 7
    .line 8
    return-object p0
.end method

.method public final c(Lne0;ILwv;)Lp81;
    .locals 1

    .line 1
    if-ltz p2, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    if-ge p2, v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, -0x2

    .line 8
    if-ne p2, v0, :cond_1

    .line 9
    .line 10
    :goto_0
    sget-object v0, Lwv;->o:Lwv;

    .line 11
    .line 12
    if-ne p3, v0, :cond_1

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_1
    invoke-static {p0, p1, p2, p3}, Lg12;->o(Lzc4;Lne0;ILwv;)Lp81;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    :goto_1
    return-object p0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lvu3;->n:Lnl4;

    .line 2
    .line 3
    invoke-virtual {p0}, Lnl4;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
