.class public final Lr90;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Ljava/util/concurrent/ExecutorService;

.field public final b:Lrm0;

.field public final c:Ljava/util/concurrent/ExecutorService;

.field public final d:Lxi4;

.field public final e:Lfz0;

.field public final f:Lrv2;

.field public final g:Lhg3;

.field public final h:I

.field public final i:I

.field public final j:I

.field public final k:I

.field public final l:Z

.field public final m:Li80;


# direct methods
.method public constructor <init>(Li80;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    invoke-static {p1}, Lwr1;->b(Z)Ljava/util/concurrent/ExecutorService;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, Lr90;->a:Ljava/util/concurrent/ExecutorService;

    .line 10
    .line 11
    sget-object p1, Lrr0;->a:Lrm0;

    .line 12
    .line 13
    iput-object p1, p0, Lr90;->b:Lrm0;

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    invoke-static {p1}, Lwr1;->b(Z)Ljava/util/concurrent/ExecutorService;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, Lr90;->c:Ljava/util/concurrent/ExecutorService;

    .line 21
    .line 22
    new-instance v0, Lxi4;

    .line 23
    .line 24
    const/16 v1, 0x11

    .line 25
    .line 26
    invoke-direct {v0, v1}, Lxi4;-><init>(I)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lr90;->d:Lxi4;

    .line 30
    .line 31
    sget-object v0, Lfz0;->U:Lfz0;

    .line 32
    .line 33
    iput-object v0, p0, Lr90;->e:Lfz0;

    .line 34
    .line 35
    sget-object v0, Lrv2;->u:Lrv2;

    .line 36
    .line 37
    iput-object v0, p0, Lr90;->f:Lrv2;

    .line 38
    .line 39
    new-instance v0, Lhg3;

    .line 40
    .line 41
    const/16 v1, 0xe

    .line 42
    .line 43
    invoke-direct {v0, v1}, Lhg3;-><init>(I)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, Lr90;->g:Lhg3;

    .line 47
    .line 48
    const/4 v0, 0x4

    .line 49
    iput v0, p0, Lr90;->h:I

    .line 50
    .line 51
    const v0, 0x7fffffff

    .line 52
    .line 53
    .line 54
    iput v0, p0, Lr90;->i:I

    .line 55
    .line 56
    const/16 v0, 0x14

    .line 57
    .line 58
    iput v0, p0, Lr90;->k:I

    .line 59
    .line 60
    const/16 v0, 0x8

    .line 61
    .line 62
    iput v0, p0, Lr90;->j:I

    .line 63
    .line 64
    iput-boolean p1, p0, Lr90;->l:Z

    .line 65
    .line 66
    new-instance p1, Li80;

    .line 67
    .line 68
    const/4 v0, 0x3

    .line 69
    invoke-direct {p1, v0}, Li80;-><init>(I)V

    .line 70
    .line 71
    .line 72
    iput-object p1, p0, Lr90;->m:Li80;

    .line 73
    .line 74
    return-void
.end method
