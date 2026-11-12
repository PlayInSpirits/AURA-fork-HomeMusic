.class public final Lzs0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final c:Ljn0;


# instance fields
.field public final a:Lbn2;

.field public final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Ljn0;->F0:Ljn0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v1, Lin0;

    .line 7
    .line 8
    invoke-direct {v1, v0}, Lin0;-><init>(Ljn0;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, v1, Lbw4;->G:Z

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-boolean v0, v1, Lin0;->N:Z

    .line 16
    .line 17
    new-instance v0, Ljn0;

    .line 18
    .line 19
    invoke-direct {v0, v1}, Ljn0;-><init>(Lin0;)V

    .line 20
    .line 21
    .line 22
    sput-object v0, Lzs0;->c:Ljn0;

    .line 23
    .line 24
    return-void
.end method

.method public constructor <init>(Lgn2;Lbq;Lcw4;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object p1, p1, Lgn2;->b:Lbn2;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lzs0;->a:Lbn2;

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    const/4 v0, 0x0

    .line 13
    if-nez p2, :cond_0

    .line 14
    .line 15
    move p2, v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    instance-of p2, p2, Lkr3;

    .line 18
    .line 19
    if-eqz p2, :cond_1

    .line 20
    .line 21
    move p2, p1

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/4 p2, 0x2

    .line 24
    :goto_0
    iput p2, p0, Lzs0;->b:I

    .line 25
    .line 26
    new-instance p0, Lpn0;

    .line 27
    .line 28
    new-instance p2, Lom0;

    .line 29
    .line 30
    const/16 v1, 0x8

    .line 31
    .line 32
    invoke-direct {p2, v1}, Lom0;-><init>(I)V

    .line 33
    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    invoke-direct {p0, p3, p2, v1}, Lpn0;-><init>(Lcw4;Ls41;Lcom/eddyizm/tempus/service/MediaService;)V

    .line 37
    .line 38
    .line 39
    new-instance p2, Landroid/util/SparseIntArray;

    .line 40
    .line 41
    invoke-direct {p2}, Landroid/util/SparseIntArray;-><init>()V

    .line 42
    .line 43
    .line 44
    new-instance p2, Lmj0;

    .line 45
    .line 46
    const/16 p3, 0xb

    .line 47
    .line 48
    invoke-direct {p2, p3}, Lmj0;-><init>(I)V

    .line 49
    .line 50
    .line 51
    new-instance p3, Lom0;

    .line 52
    .line 53
    const/16 v2, 0x9

    .line 54
    .line 55
    invoke-direct {p3, v2}, Lom0;-><init>(I)V

    .line 56
    .line 57
    .line 58
    iget-object v2, p0, Lpn0;->a:Ldw4;

    .line 59
    .line 60
    if-nez v2, :cond_2

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    move p1, v0

    .line 64
    :goto_1
    invoke-static {p1}, Lrr2;->w(Z)V

    .line 65
    .line 66
    .line 67
    iput-object p2, p0, Lpn0;->a:Ldw4;

    .line 68
    .line 69
    iput-object p3, p0, Lpn0;->b:Lcp;

    .line 70
    .line 71
    invoke-static {v1}, Lf35;->q(Lgt0;)Landroid/os/Handler;

    .line 72
    .line 73
    .line 74
    new-instance p0, Lbu4;

    .line 75
    .line 76
    return-void
.end method
