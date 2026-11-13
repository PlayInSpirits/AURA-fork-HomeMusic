.class public final Ldefpackage/jy3;
.super Ldefpackage/jx1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final transient q:Ldefpackage/bx1;

.field public final transient r:Ldefpackage/ky3;


# direct methods
.method public constructor <init>(Ldefpackage/bx1;Ldefpackage/ky3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/jy3;->q:Ldefpackage/bx1;

    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/jy3;->r:Ldefpackage/ky3;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Ldefpackage/yw1;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/jy3;->r:Ldefpackage/ky3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b(I[Ljava/lang/Object;)I
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/jy3;->r:Ldefpackage/ky3;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Ldefpackage/yw1;->b(I[Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/jy3;->q:Ldefpackage/bx1;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ldefpackage/bx1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public final g()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final h()Ldefpackage/o15;
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/jy3;->r:Ldefpackage/ky3;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, v0}, Ldefpackage/yw1;->m(I)Ldefpackage/vw1;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0
.end method

.method public final size()I
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/jy3;->q:Ldefpackage/bx1;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Map;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
