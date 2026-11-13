.class public final Ldefpackage/ia3;
.super Ldefpackage/e22;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final f:Ldefpackage/ia3;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ldefpackage/ia3;

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
    sput-object v0, Ldefpackage/ia3;->f:Ldefpackage/ia3;

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
    check-cast p0, Ldefpackage/lv3;

    .line 7
    .line 8
    iget-object p1, p4, Ldefpackage/uy3;->a:Ljava/util/Set;

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    new-instance p2, Ldefpackage/ff3;

    .line 14
    .line 15
    invoke-direct {p2, p1}, Ldefpackage/ff3;-><init>(Ljava/util/Set;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p4, Ldefpackage/uy3;->i:Ldefpackage/w03;

    .line 19
    .line 20
    if-nez p1, :cond_1

    .line 21
    .line 22
    sget-object p1, Ldefpackage/v54;->a:[J

    .line 23
    .line 24
    new-instance p1, Ldefpackage/w03;

    .line 25
    .line 26
    invoke-direct {p1}, Ldefpackage/w03;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p4, Ldefpackage/uy3;->i:Ldefpackage/w03;

    .line 30
    .line 31
    :cond_1
    invoke-virtual {p1, p0, p2}, Ldefpackage/w03;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object p0, p4, Ldefpackage/uy3;->e:Ldefpackage/f13;

    .line 35
    .line 36
    new-instance p1, Ldefpackage/wg1;

    .line 37
    .line 38
    const/4 p3, -0x1

    .line 39
    invoke-direct {p1, p2, p3}, Ldefpackage/wg1;-><init>(Ldefpackage/vy3;I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, p1}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public constructor <init>(III)V
    .registers 4

    invoke-direct/range {p0 .. p3}, Ldefpackage/e22;-><init>(III)V

    return-void
.end method
