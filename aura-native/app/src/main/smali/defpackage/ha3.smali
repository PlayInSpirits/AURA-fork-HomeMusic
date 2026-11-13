.class public final Ldefpackage/ha3;
.super Ldefpackage/e22;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final f:Ldefpackage/ha3;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ldefpackage/ha3;

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
    sput-object v0, Ldefpackage/ha3;->f:Ldefpackage/ha3;

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
    move-result-object p0

    .line 6
    check-cast p0, Ldefpackage/wg1;

    .line 7
    .line 8
    iget-object p1, p4, Ldefpackage/uy3;->e:Ldefpackage/f13;

    .line 9
    .line 10
    invoke-virtual {p1, p0}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p4, Ldefpackage/uy3;->d:Ldefpackage/x03;

    .line 14
    .line 15
    invoke-virtual {p1, p0}, Ldefpackage/x03;->a(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>(III)V
    .registers 4

    invoke-direct/range {p0 .. p3}, Ldefpackage/e22;-><init>(III)V

    return-void
.end method
