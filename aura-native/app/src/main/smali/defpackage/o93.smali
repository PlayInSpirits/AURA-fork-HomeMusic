.class public final Ldefpackage/o93;
.super Ldefpackage/e22;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final f:Ldefpackage/o93;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ldefpackage/o93;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x1

    .line 6
    invoke-direct {v0, v3, v1, v2}, Ldefpackage/e22;-><init>(III)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Ldefpackage/o93;->f:Ldefpackage/o93;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final d(Ldefpackage/x20;Ldefpackage/bi;Ldefpackage/lg4;Ldefpackage/uy3;Ldefpackage/wa3;)V
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    invoke-virtual {p1, p0}, Ldefpackage/x20;->c(I)I

    .line 3
    .line 4
    .line 5
    move-result p0

    .line 6
    invoke-virtual {p3, p0}, Ldefpackage/lg4;->a(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(III)V
    .registers 4

    invoke-direct/range {p0 .. p3}, Ldefpackage/e22;-><init>(III)V

    return-void
.end method
