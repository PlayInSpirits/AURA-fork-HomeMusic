.class public final Ldefpackage/v93;
.super Ldefpackage/e22;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final f:Ldefpackage/v93;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ldefpackage/v93;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-direct {v0, v1, v2, v2}, Ldefpackage/e22;-><init>(III)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Ldefpackage/v93;->f:Ldefpackage/v93;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final d(Ldefpackage/x20;Ldefpackage/bi;Ldefpackage/lg4;Ldefpackage/uy3;Ldefpackage/wa3;)V
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    invoke-virtual {p1, p0}, Ldefpackage/x20;->d(I)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    check-cast p1, [Ljava/lang/Object;

    .line 7
    .line 8
    array-length p3, p1

    .line 9
    :goto_0
    if-ge p0, p3, :cond_0

    .line 10
    .line 11
    aget-object p4, p1, p0

    .line 12
    .line 13
    invoke-interface {p2, p4}, Ldefpackage/bi;->b(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    add-int/lit8 p0, p0, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-void
.end method

.method public constructor <init>(III)V
    .registers 4

    invoke-direct/range {p0 .. p3}, Ldefpackage/e22;-><init>(III)V

    return-void
.end method
