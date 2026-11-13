.class public final Ldefpackage/s93;
.super Ldefpackage/e22;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final f:Ldefpackage/s93;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ldefpackage/s93;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    invoke-direct {v0, v3, v1, v2}, Ldefpackage/e22;-><init>(III)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Ldefpackage/s93;->f:Ldefpackage/s93;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final d(Ldefpackage/x20;Ldefpackage/bi;Ldefpackage/lg4;Ldefpackage/uy3;Ldefpackage/wa3;)V
    .locals 0

    .line 1
    const/4 p0, 0x2

    .line 2
    invoke-virtual {p1, p0}, Ldefpackage/x20;->d(I)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    check-cast p0, Ldefpackage/jy2;

    .line 7
    .line 8
    const/4 p2, 0x3

    .line 9
    invoke-virtual {p1, p2}, Ldefpackage/x20;->d(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    check-cast p2, Ldefpackage/jy2;

    .line 14
    .line 15
    const/4 p2, 0x1

    .line 16
    invoke-virtual {p1, p2}, Ldefpackage/x20;->d(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    check-cast p2, Ldefpackage/u80;

    .line 21
    .line 22
    const/4 p3, 0x0

    .line 23
    invoke-virtual {p1, p3}, Ldefpackage/x20;->d(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Ldefpackage/iy2;

    .line 28
    .line 29
    invoke-virtual {p2, p0}, Ldefpackage/u80;->m(Ldefpackage/jy2;)Ldefpackage/iy2;

    .line 30
    .line 31
    .line 32
    const-string p0, "Could not resolve state for movable content"

    .line 33
    .line 34
    invoke-static {p0}, Ldefpackage/l80;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 35
    .line 36
    .line 37
    invoke-static {}, Ldefpackage/er1;->a()V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public constructor <init>(III)V
    .registers 4

    invoke-direct/range {p0 .. p3}, Ldefpackage/e22;-><init>(III)V

    return-void
.end method
