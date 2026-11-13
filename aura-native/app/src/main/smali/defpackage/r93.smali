.class public final Ldefpackage/r93;
.super Ldefpackage/e22;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final f:Ldefpackage/r93;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ldefpackage/r93;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    invoke-direct {v0, v3, v1, v2}, Ldefpackage/e22;-><init>(III)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Ldefpackage/r93;->f:Ldefpackage/r93;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final d(Ldefpackage/x20;Ldefpackage/bi;Ldefpackage/lg4;Ldefpackage/uy3;Ldefpackage/wa3;)V
    .locals 1

    .line 1
    const/4 p0, 0x0

    .line 2
    invoke-virtual {p1, p0}, Ldefpackage/x20;->d(I)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p3

    .line 6
    check-cast p3, Ldefpackage/l02;

    .line 7
    .line 8
    iget p3, p3, Ldefpackage/l02;->a:I

    .line 9
    .line 10
    const/4 p4, 0x1

    .line 11
    invoke-virtual {p1, p4}, Ldefpackage/x20;->d(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 18
    .line 19
    .line 20
    move-result p4

    .line 21
    :goto_0
    if-ge p0, p4, :cond_0

    .line 22
    .line 23
    invoke-interface {p1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p5

    .line 27
    add-int v0, p3, p0

    .line 28
    .line 29
    invoke-interface {p2, v0, p5}, Ldefpackage/bi;->a(ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p2, v0, p5}, Ldefpackage/bi;->h(ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    add-int/lit8 p0, p0, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    return-void
.end method

.method public constructor <init>(III)V
    .registers 4

    invoke-direct/range {p0 .. p3}, Ldefpackage/e22;-><init>(III)V

    return-void
.end method
