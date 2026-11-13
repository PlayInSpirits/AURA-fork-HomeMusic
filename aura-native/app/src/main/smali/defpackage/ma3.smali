.class public final Ldefpackage/ma3;
.super Ldefpackage/e22;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final f:Ldefpackage/ma3;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ldefpackage/ma3;

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
    sput-object v0, Ldefpackage/ma3;->f:Ldefpackage/ma3;

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
    check-cast p0, Ldefpackage/gf1;

    .line 7
    .line 8
    iget-object p1, p4, Ldefpackage/uy3;->g:Ldefpackage/f13;

    .line 9
    .line 10
    invoke-virtual {p1, p0}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(III)V
    .registers 4

    invoke-direct/range {p0 .. p3}, Ldefpackage/e22;-><init>(III)V

    return-void
.end method
