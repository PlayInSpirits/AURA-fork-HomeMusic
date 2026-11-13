.class public final Ldefpackage/ky3;
.super Ldefpackage/yw1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final transient p:[Ljava/lang/Object;

.field public final transient q:I

.field public final transient r:I


# direct methods
.method public constructor <init>([Ljava/lang/Object;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/ky3;->p:[Ljava/lang/Object;

    .line 5
    .line 6
    iput p2, p0, Ldefpackage/ky3;->q:I

    .line 7
    .line 8
    iput p3, p0, Ldefpackage/ky3;->r:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final g()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/ky3;->r:I

    .line 2
    .line 3
    invoke-static {p1, v0}, Ldefpackage/rr2;->q(II)V

    .line 4
    .line 5
    .line 6
    mul-int/lit8 p1, p1, 0x2

    .line 7
    .line 8
    iget v0, p0, Ldefpackage/ky3;->q:I

    .line 9
    .line 10
    add-int/2addr p1, v0

    .line 11
    iget-object p0, p0, Ldefpackage/ky3;->p:[Ljava/lang/Object;

    .line 12
    .line 13
    aget-object p0, p0, p1

    .line 14
    .line 15
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    return-object p0
.end method

.method public final size()I
    .locals 0

    .line 1
    iget p0, p0, Ldefpackage/ky3;->r:I

    .line 2
    .line 3
    return p0
.end method
