.class public final Lf82;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lwi2;


# instance fields
.field public final n:Lc82;

.field public final o:Lln4;

.field public final p:Lnc3;

.field public final q:Li03;


# direct methods
.method public constructor <init>(Lc82;Lln4;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lf82;->n:Lc82;

    .line 5
    .line 6
    iput-object p2, p0, Lf82;->o:Lln4;

    .line 7
    .line 8
    iget-object p1, p1, Lc82;->b:Lwc;

    .line 9
    .line 10
    invoke-virtual {p1}, Lwc;->invoke()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lnc3;

    .line 15
    .line 16
    iput-object p1, p0, Lf82;->p:Lnc3;

    .line 17
    .line 18
    invoke-static {}, Lf02;->a()Li03;

    .line 19
    .line 20
    .line 21
    new-instance p1, Li03;

    .line 22
    .line 23
    invoke-direct {p1}, Li03;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Lf82;->q:Li03;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final B(I)F
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public final D(F)F
    .locals 0

    .line 1
    iget-object p0, p0, Lf82;->o:Lln4;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Loo0;->D(F)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final J()F
    .locals 0

    .line 1
    iget-object p0, p0, Lf82;->o:Lln4;

    .line 2
    .line 3
    invoke-interface {p0}, Loo0;->J()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final K()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lf82;->o:Lln4;

    .line 2
    .line 3
    invoke-interface {p0}, Lwi2;->K()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final M(F)F
    .locals 0

    .line 1
    iget-object p0, p0, Lf82;->o:Lln4;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Loo0;->M(F)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final T(IILjava/util/Map;Lif1;Lif1;)Lvi2;
    .locals 0

    .line 1
    iget-object p0, p0, Lf82;->o:Lln4;

    .line 2
    .line 3
    invoke-interface/range {p0 .. p5}, Lwi2;->T(IILjava/util/Map;Lif1;Lif1;)Lvi2;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final V(F)I
    .locals 0

    .line 1
    iget-object p0, p0, Lf82;->o:Lln4;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Loo0;->V(F)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final Y(J)J
    .locals 0

    .line 1
    iget-object p0, p0, Lf82;->o:Lln4;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Loo0;->Y(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method

.method public final a(I)Ljava/util/List;
    .locals 3

    .line 1
    iget-object v0, p0, Lf82;->q:Li03;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Le02;->b(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ljava/util/List;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-object v1

    .line 12
    :cond_0
    iget-object v1, p0, Lf82;->p:Lnc3;

    .line 13
    .line 14
    invoke-virtual {v1, p1}, Lnc3;->c(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iget-object v2, p0, Lf82;->n:Lc82;

    .line 19
    .line 20
    invoke-virtual {v2, p1, v1}, Lc82;->a(ILjava/lang/Object;)Lwf1;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    iget-object p0, p0, Lf82;->o:Lln4;

    .line 25
    .line 26
    invoke-interface {p0, v2, v1}, Lln4;->m(Lwf1;Ljava/lang/Object;)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {v0, p1, p0}, Li03;->i(ILjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-object p0
.end method

.method public final a0(J)F
    .locals 0

    .line 1
    iget-object p0, p0, Lf82;->o:Lln4;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Loo0;->a0(J)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final g()F
    .locals 0

    .line 1
    iget-object p0, p0, Lf82;->o:Lln4;

    .line 2
    .line 3
    invoke-interface {p0}, Loo0;->g()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final getLayoutDirection()Lr62;
    .locals 0

    .line 1
    iget-object p0, p0, Lf82;->o:Lln4;

    .line 2
    .line 3
    invoke-interface {p0}, Lwi2;->getLayoutDirection()Lr62;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final h(F)J
    .locals 0

    .line 1
    iget-object p0, p0, Lf82;->o:Lln4;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Loo0;->h(F)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method

.method public final i(J)J
    .locals 0

    .line 1
    iget-object p0, p0, Lf82;->o:Lln4;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Loo0;->i(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method

.method public final o(J)F
    .locals 0

    .line 1
    iget-object p0, p0, Lf82;->o:Lln4;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Loo0;->o(J)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final v(IILjava/util/Map;Lif1;)Lvi2;
    .locals 0

    .line 1
    iget-object p0, p0, Lf82;->o:Lln4;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2, p3, p4}, Lwi2;->v(IILjava/util/Map;Lif1;)Lvi2;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final w(F)J
    .locals 0

    .line 1
    iget-object p0, p0, Lf82;->o:Lln4;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Loo0;->w(F)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method
