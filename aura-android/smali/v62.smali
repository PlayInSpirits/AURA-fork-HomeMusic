.class public final Lv62;
.super Lef2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic N:Lw62;


# direct methods
.method public constructor <init>(Lw62;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lv62;->N:Lw62;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lef2;-><init>(Lf63;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final X(Lpp1;)I
    .locals 1

    .line 1
    invoke-static {p0, p1}, Lzz1;->a(Lcf2;Lpp1;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object p0, p0, Lef2;->M:Lp03;

    .line 6
    .line 7
    invoke-virtual {p0, v0, p1}, Lp03;->g(ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return v0
.end method

.method public final r(J)Ljg3;
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, Ljg3;->R(J)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lnc0;

    .line 5
    .line 6
    invoke-direct {v0, p1, p2}, Lnc0;-><init>(J)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lv62;->N:Lw62;

    .line 10
    .line 11
    iget-object v1, v0, Lw62;->n0:Lu62;

    .line 12
    .line 13
    iget-object v0, v0, Lf63;->I:Lf63;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lf63;->y0()Lef2;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-interface {v1, p0, v0, p1, p2}, Lu62;->r(Lcf2;Lpi2;J)Lvi2;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {p0, p1}, Lef2;->p0(Lef2;Lvi2;)V

    .line 30
    .line 31
    .line 32
    return-object p0
.end method
