.class public final Ln83;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public A:I

.field public B:I

.field public C:J

.field public D:Lrm2;

.field public E:Lgr4;

.field public a:Lna4;

.field public b:Ld34;

.field public final c:Ljava/util/ArrayList;

.field public final d:Ljava/util/ArrayList;

.field public e:Ltb4;

.field public f:Z

.field public g:Z

.field public h:Lfz0;

.field public i:Z

.field public j:Z

.field public k:Lbe0;

.field public l:Lhx;

.field public m:Lfz0;

.field public n:Ljava/net/ProxySelector;

.field public o:Lfz0;

.field public p:Ljavax/net/SocketFactory;

.field public q:Ljavax/net/ssl/SSLSocketFactory;

.field public r:Ljavax/net/ssl/X509TrustManager;

.field public s:Ljava/util/List;

.field public t:Ljava/util/List;

.field public u:Lm83;

.field public v:Lo00;

.field public w:Lrr2;

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lna4;

    .line 5
    .line 6
    const/4 v1, 0x4

    .line 7
    invoke-direct {v0, v1}, Lna4;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Ln83;->a:Lna4;

    .line 11
    .line 12
    new-instance v0, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Ln83;->c:Ljava/util/ArrayList;

    .line 18
    .line 19
    new-instance v0, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Ln83;->d:Ljava/util/ArrayList;

    .line 25
    .line 26
    sget-object v0, Lze5;->a:Ltl1;

    .line 27
    .line 28
    new-instance v0, Ltb4;

    .line 29
    .line 30
    const/16 v1, 0x13

    .line 31
    .line 32
    invoke-direct {v0, v1}, Ltb4;-><init>(I)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Ln83;->e:Ltb4;

    .line 36
    .line 37
    const/4 v0, 0x1

    .line 38
    iput-boolean v0, p0, Ln83;->f:Z

    .line 39
    .line 40
    iput-boolean v0, p0, Ln83;->g:Z

    .line 41
    .line 42
    sget-object v1, Lfz0;->A:Lfz0;

    .line 43
    .line 44
    iput-object v1, p0, Ln83;->h:Lfz0;

    .line 45
    .line 46
    iput-boolean v0, p0, Ln83;->i:Z

    .line 47
    .line 48
    iput-boolean v0, p0, Ln83;->j:Z

    .line 49
    .line 50
    sget-object v0, Lbe0;->g:Li80;

    .line 51
    .line 52
    iput-object v0, p0, Ln83;->k:Lbe0;

    .line 53
    .line 54
    sget-object v0, Lfz0;->W:Lfz0;

    .line 55
    .line 56
    iput-object v0, p0, Ln83;->m:Lfz0;

    .line 57
    .line 58
    iput-object v1, p0, Ln83;->o:Lfz0;

    .line 59
    .line 60
    invoke-static {}, Ljavax/net/SocketFactory;->getDefault()Ljavax/net/SocketFactory;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    iput-object v0, p0, Ln83;->p:Ljavax/net/SocketFactory;

    .line 68
    .line 69
    sget-object v0, Lo83;->G:Ljava/util/List;

    .line 70
    .line 71
    iput-object v0, p0, Ln83;->s:Ljava/util/List;

    .line 72
    .line 73
    sget-object v0, Lo83;->F:Ljava/util/List;

    .line 74
    .line 75
    iput-object v0, p0, Ln83;->t:Ljava/util/List;

    .line 76
    .line 77
    sget-object v0, Lm83;->a:Lm83;

    .line 78
    .line 79
    iput-object v0, p0, Ln83;->u:Lm83;

    .line 80
    .line 81
    sget-object v0, Lo00;->c:Lo00;

    .line 82
    .line 83
    iput-object v0, p0, Ln83;->v:Lo00;

    .line 84
    .line 85
    const/16 v0, 0x2710

    .line 86
    .line 87
    iput v0, p0, Ln83;->y:I

    .line 88
    .line 89
    iput v0, p0, Ln83;->z:I

    .line 90
    .line 91
    iput v0, p0, Ln83;->A:I

    .line 92
    .line 93
    const v0, 0xea60

    .line 94
    .line 95
    .line 96
    iput v0, p0, Ln83;->B:I

    .line 97
    .line 98
    const-wide/16 v0, 0x400

    .line 99
    .line 100
    iput-wide v0, p0, Ln83;->C:J

    .line 101
    .line 102
    return-void
.end method


# virtual methods
.method public final a(JLjava/util/concurrent/TimeUnit;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1, p2, p3}, Lze5;->b(JLjava/util/concurrent/TimeUnit;)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    iput p1, p0, Ln83;->x:I

    .line 9
    .line 10
    return-void
.end method

.method public final b(JLjava/util/concurrent/TimeUnit;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1, p2, p3}, Lze5;->b(JLjava/util/concurrent/TimeUnit;)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    iput p1, p0, Ln83;->y:I

    .line 9
    .line 10
    return-void
.end method

.method public final c(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Ln83;->q:Ljavax/net/ssl/SSLSocketFactory;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Ln83;->r:Ljavax/net/ssl/X509TrustManager;

    .line 16
    .line 17
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    iput-object v0, p0, Ln83;->D:Lrm2;

    .line 25
    .line 26
    :cond_1
    iput-object p1, p0, Ln83;->q:Ljavax/net/ssl/SSLSocketFactory;

    .line 27
    .line 28
    sget-object p1, Lqg3;->a:Lqg3;

    .line 29
    .line 30
    sget-object p1, Lqg3;->a:Lqg3;

    .line 31
    .line 32
    invoke-virtual {p1, p2}, Lqg3;->b(Ljavax/net/ssl/X509TrustManager;)Lrr2;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, Ln83;->w:Lrr2;

    .line 37
    .line 38
    iput-object p2, p0, Ln83;->r:Ljavax/net/ssl/X509TrustManager;

    .line 39
    .line 40
    return-void
.end method
