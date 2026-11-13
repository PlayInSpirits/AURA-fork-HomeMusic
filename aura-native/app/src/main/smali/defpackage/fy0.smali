.class public final synthetic Ldefpackage/fy0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/util/function/Function;

.field public final synthetic c:Ljava/util/function/Function;

.field public final synthetic d:Ljava/util/function/Function;


# direct methods
.method public synthetic constructor <init>(Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/Function;I)V
    .locals 0

    .line 1
    iput p4, p0, Ldefpackage/fy0;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/fy0;->b:Ljava/util/function/Function;

    .line 4
    .line 5
    iput-object p2, p0, Ldefpackage/fy0;->c:Ljava/util/function/Function;

    .line 6
    .line 7
    iput-object p3, p0, Ldefpackage/fy0;->d:Ljava/util/function/Function;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Ldefpackage/fy0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v1, p1

    .line 7
    check-cast v1, Ldefpackage/d64;

    .line 8
    .line 9
    new-instance v3, Ldefpackage/zx0;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {v3, v1, p1}, Ldefpackage/zx0;-><init>(Ldefpackage/d64;I)V

    .line 13
    .line 14
    .line 15
    new-instance v4, Ldefpackage/ay0;

    .line 16
    .line 17
    iget-object v5, p0, Ldefpackage/fy0;->c:Ljava/util/function/Function;

    .line 18
    .line 19
    invoke-direct {v4, v5, v1}, Ldefpackage/ay0;-><init>(Ljava/util/function/Function;Ldefpackage/d64;)V

    .line 20
    .line 21
    .line 22
    const/4 v7, 0x0

    .line 23
    const/4 v8, 0x0

    .line 24
    iget-object v2, p0, Ldefpackage/fy0;->b:Ljava/util/function/Function;

    .line 25
    .line 26
    iget-object v6, p0, Ldefpackage/fy0;->d:Ljava/util/function/Function;

    .line 27
    .line 28
    invoke-static/range {v1 .. v8}, Ldefpackage/gy0;->a(Ldefpackage/d64;Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/BiFunction;Ljava/util/function/Function;Ljava/util/function/Function;Ldefpackage/dy0;Ljava/util/function/Function;)D

    .line 29
    .line 30
    .line 31
    move-result-wide p0

    .line 32
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    :pswitch_0
    move-object v0, p1

    .line 38
    check-cast v0, Ldefpackage/d64;

    .line 39
    .line 40
    new-instance v2, Ldefpackage/zx0;

    .line 41
    .line 42
    const/4 p1, 0x1

    .line 43
    invoke-direct {v2, v0, p1}, Ldefpackage/zx0;-><init>(Ldefpackage/d64;I)V

    .line 44
    .line 45
    .line 46
    new-instance v3, Ldefpackage/by0;

    .line 47
    .line 48
    iget-object v1, p0, Ldefpackage/fy0;->b:Ljava/util/function/Function;

    .line 49
    .line 50
    iget-object v4, p0, Ldefpackage/fy0;->c:Ljava/util/function/Function;

    .line 51
    .line 52
    invoke-direct {v3, v1, v0, v4}, Ldefpackage/by0;-><init>(Ljava/util/function/Function;Ldefpackage/d64;Ljava/util/function/Function;)V

    .line 53
    .line 54
    .line 55
    new-instance v7, Ldefpackage/m7;

    .line 56
    .line 57
    const/16 p1, 0x17

    .line 58
    .line 59
    invoke-direct {v7, p1}, Ldefpackage/m7;-><init>(I)V

    .line 60
    .line 61
    .line 62
    iget-object v5, p0, Ldefpackage/fy0;->d:Ljava/util/function/Function;

    .line 63
    .line 64
    const/4 v6, 0x0

    .line 65
    invoke-static/range {v0 .. v7}, Ldefpackage/gy0;->a(Ldefpackage/d64;Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/BiFunction;Ljava/util/function/Function;Ljava/util/function/Function;Ldefpackage/dy0;Ljava/util/function/Function;)D

    .line 66
    .line 67
    .line 68
    move-result-wide p0

    .line 69
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
