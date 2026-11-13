.class public final Ldefpackage/l72;
.super Ldefpackage/z62;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic a:Ldefpackage/o72;

.field public final synthetic b:Ldefpackage/wf1;


# direct methods
.method public constructor <init>(Ldefpackage/o72;Ldefpackage/wf1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/l72;->a:Ldefpackage/o72;

    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/l72;->b:Ldefpackage/wf1;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Ldefpackage/cf2;Ljava/util/List;J)Ldefpackage/vi2;
    .locals 6

    .line 1
    iget-object v2, p0, Ldefpackage/l72;->a:Ldefpackage/o72;

    .line 2
    .line 3
    iget-object p2, v2, Ldefpackage/o72;->u:Ldefpackage/j72;

    .line 4
    .line 5
    invoke-interface {p1}, Ldefpackage/wi2;->getLayoutDirection()Ldefpackage/r62;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p2, Ldefpackage/j72;->n:Ldefpackage/r62;

    .line 10
    .line 11
    invoke-interface {p1}, Ldefpackage/oo0;->g()F

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iput v0, p2, Ldefpackage/j72;->o:F

    .line 16
    .line 17
    invoke-interface {p1}, Ldefpackage/oo0;->J()F

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iput v0, p2, Ldefpackage/j72;->p:F

    .line 22
    .line 23
    invoke-interface {p1}, Ldefpackage/wi2;->K()Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    iget-object p0, p0, Ldefpackage/l72;->b:Ldefpackage/wf1;

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    if-nez p1, :cond_0

    .line 31
    .line 32
    iget-object p1, v2, Ldefpackage/o72;->n:Ldefpackage/c72;

    .line 33
    .line 34
    iget-object p1, p1, Ldefpackage/c72;->u:Ldefpackage/c72;

    .line 35
    .line 36
    if-eqz p1, :cond_0

    .line 37
    .line 38
    iput v0, v2, Ldefpackage/o72;->r:I

    .line 39
    .line 40
    iget-object p1, v2, Ldefpackage/o72;->v:Ldefpackage/g72;

    .line 41
    .line 42
    new-instance p2, Ldefpackage/nc0;

    .line 43
    .line 44
    invoke-direct {p2, p3, p4}, Ldefpackage/nc0;-><init>(J)V

    .line 45
    .line 46
    .line 47
    invoke-interface {p0, p1, p2}, Ldefpackage/wf1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    move-object v1, p0

    .line 52
    check-cast v1, Ldefpackage/vi2;

    .line 53
    .line 54
    iget v3, v2, Ldefpackage/o72;->r:I

    .line 55
    .line 56
    new-instance v0, Ldefpackage/k72;

    .line 57
    .line 58
    const/4 v5, 0x0

    .line 59
    move-object v4, v1

    .line 60
    invoke-direct/range {v0 .. v5}, Ldefpackage/k72;-><init>(Ldefpackage/vi2;Ldefpackage/o72;ILdefpackage/vi2;I)V

    .line 61
    .line 62
    .line 63
    return-object v0

    .line 64
    :cond_0
    iput v0, v2, Ldefpackage/o72;->q:I

    .line 65
    .line 66
    new-instance p1, Ldefpackage/nc0;

    .line 67
    .line 68
    invoke-direct {p1, p3, p4}, Ldefpackage/nc0;-><init>(J)V

    .line 69
    .line 70
    .line 71
    invoke-interface {p0, p2, p1}, Ldefpackage/wf1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    move-object v1, p0

    .line 76
    check-cast v1, Ldefpackage/vi2;

    .line 77
    .line 78
    iget v3, v2, Ldefpackage/o72;->q:I

    .line 79
    .line 80
    new-instance v0, Ldefpackage/k72;

    .line 81
    .line 82
    const/4 v5, 0x1

    .line 83
    move-object v4, v1

    .line 84
    invoke-direct/range {v0 .. v5}, Ldefpackage/k72;-><init>(Ldefpackage/vi2;Ldefpackage/o72;ILdefpackage/vi2;I)V

    .line 85
    .line 86
    .line 87
    return-object v0
.end method
