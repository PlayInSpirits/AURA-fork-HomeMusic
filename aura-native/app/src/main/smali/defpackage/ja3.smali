.class public final Ldefpackage/ja3;
.super Ldefpackage/e22;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final f:Ldefpackage/ja3;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ldefpackage/ja3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x3

    .line 5
    invoke-direct {v0, v1, v1, v2}, Ldefpackage/e22;-><init>(III)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Ldefpackage/ja3;->f:Ldefpackage/ja3;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final d(Ldefpackage/x20;Ldefpackage/bi;Ldefpackage/lg4;Ldefpackage/uy3;Ldefpackage/wa3;)V
    .locals 0

    .line 1
    iget p0, p3, Ldefpackage/lg4;->t:I

    .line 2
    .line 3
    new-instance p1, Ldefpackage/z;

    .line 4
    .line 5
    const/4 p2, 0x3

    .line 6
    invoke-direct {p1, p2, p4}, Ldefpackage/z;-><init>(ILjava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p3, p0, p1}, Ldefpackage/lg4;->n(ILdefpackage/wf1;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p3}, Ldefpackage/lg4;->H()Z

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(III)V
    .registers 4

    invoke-direct/range {p0 .. p3}, Ldefpackage/e22;-><init>(III)V

    return-void
.end method
