.class public final Ldefpackage/kx;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/bi0;


# instance fields
.field public n:Ldefpackage/se4;

.field public final o:Ldefpackage/y41;

.field public p:Ldefpackage/px;

.field public q:Z

.field public r:Ldefpackage/bi0;

.field public s:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ldefpackage/y41;

    .line 5
    .line 6
    const/4 v1, 0x6

    .line 7
    invoke-direct {v0, v1}, Ldefpackage/y41;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Ldefpackage/kx;->o:Ldefpackage/y41;

    .line 11
    .line 12
    sget-object v0, Ldefpackage/px;->c:Ldefpackage/kf2;

    .line 13
    .line 14
    iput-object v0, p0, Ldefpackage/kx;->p:Ldefpackage/px;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a()Ldefpackage/lx;
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/kx;->r:Ldefpackage/bi0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Ldefpackage/bi0;->m()Ldefpackage/ci0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    iget v1, p0, Ldefpackage/kx;->s:I

    .line 12
    .line 13
    invoke-virtual {p0, v0, v1}, Ldefpackage/kx;->c(Ldefpackage/ci0;I)Ldefpackage/lx;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final b()Ldefpackage/lx;
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/kx;->r:Ldefpackage/bi0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Ldefpackage/bi0;->m()Ldefpackage/ci0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    iget v1, p0, Ldefpackage/kx;->s:I

    .line 12
    .line 13
    or-int/lit8 v1, v1, 0x1

    .line 14
    .line 15
    invoke-virtual {p0, v0, v1}, Ldefpackage/kx;->c(Ldefpackage/ci0;I)Ldefpackage/lx;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public final c(Ldefpackage/ci0;I)Ldefpackage/lx;
    .locals 7

    .line 1
    iget-object v1, p0, Ldefpackage/kx;->n:Ldefpackage/se4;

    .line 2
    .line 3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Ldefpackage/kx;->q:Z

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    new-instance v0, Ldefpackage/jx;

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ldefpackage/jx;-><init>(Ldefpackage/se4;)V

    .line 16
    .line 17
    .line 18
    :goto_0
    move-object v4, v0

    .line 19
    goto :goto_2

    .line 20
    :cond_1
    :goto_1
    const/4 v0, 0x0

    .line 21
    goto :goto_0

    .line 22
    :goto_2
    new-instance v0, Ldefpackage/lx;

    .line 23
    .line 24
    iget-object v2, p0, Ldefpackage/kx;->o:Ldefpackage/y41;

    .line 25
    .line 26
    invoke-virtual {v2}, Ldefpackage/y41;->m()Ldefpackage/ci0;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    iget-object v5, p0, Ldefpackage/kx;->p:Ldefpackage/px;

    .line 31
    .line 32
    move-object v2, p1

    .line 33
    move v6, p2

    .line 34
    invoke-direct/range {v0 .. v6}, Ldefpackage/lx;-><init>(Ldefpackage/se4;Ldefpackage/ci0;Ldefpackage/ci0;Ldefpackage/jx;Ldefpackage/px;I)V

    .line 35
    .line 36
    .line 37
    return-object v0
.end method

.method public final bridge synthetic m()Ldefpackage/ci0;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/kx;->a()Ldefpackage/lx;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
