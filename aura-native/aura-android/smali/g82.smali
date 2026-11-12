.class public final Lg82;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lkl4;


# instance fields
.field public final n:Lzd3;

.field public o:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(I)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    div-int/lit8 v0, p1, 0x1e

    .line 5
    .line 6
    mul-int/lit8 v0, v0, 0x1e

    .line 7
    .line 8
    add-int/lit8 v1, v0, -0x64

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/lit16 v0, v0, 0x82

    .line 16
    .line 17
    invoke-static {v1, v0}, Lgb;->g0(II)Lj02;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sget-object v1, Lrv2;->D:Lrv2;

    .line 22
    .line 23
    new-instance v2, Lzd3;

    .line 24
    .line 25
    invoke-direct {v2, v0, v1}, Lzd3;-><init>(Ljava/lang/Object;Lrv2;)V

    .line 26
    .line 27
    .line 28
    iput-object v2, p0, Lg82;->n:Lzd3;

    .line 29
    .line 30
    iput p1, p0, Lg82;->o:I

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final getValue()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lg82;->n:Lzd3;

    .line 2
    .line 3
    invoke-virtual {p0}, Lzd3;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lj02;

    .line 8
    .line 9
    return-object p0
.end method
