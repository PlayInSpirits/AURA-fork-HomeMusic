.class public final Llq3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lba2;


# static fields
.field public static final v:Llq3;


# instance fields
.field public n:I

.field public o:I

.field public p:Z

.field public q:Z

.field public r:Landroid/os/Handler;

.field public final s:Lea2;

.field public final t:Ljq3;

.field public final u:Lsi1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Llq3;

    .line 2
    .line 3
    invoke-direct {v0}, Llq3;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Llq3;->v:Llq3;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Llq3;->p:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Llq3;->q:Z

    .line 8
    .line 9
    new-instance v1, Lea2;

    .line 10
    .line 11
    invoke-direct {v1, p0, v0}, Lea2;-><init>(Lba2;Z)V

    .line 12
    .line 13
    .line 14
    iput-object v1, p0, Llq3;->s:Lea2;

    .line 15
    .line 16
    new-instance v0, Ljq3;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-direct {v0, v1, p0}, Ljq3;-><init>(ILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Llq3;->t:Ljq3;

    .line 23
    .line 24
    new-instance v0, Lsi1;

    .line 25
    .line 26
    const/16 v1, 0x11

    .line 27
    .line 28
    invoke-direct {v0, v1, p0}, Lsi1;-><init>(ILjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Llq3;->u:Lsi1;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget v0, p0, Llq3;->o:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    add-int/2addr v0, v1

    .line 5
    iput v0, p0, Llq3;->o:I

    .line 6
    .line 7
    if-ne v0, v1, :cond_1

    .line 8
    .line 9
    iget-boolean v0, p0, Llq3;->p:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Llq3;->s:Lea2;

    .line 14
    .line 15
    sget-object v1, Lq92;->ON_RESUME:Lq92;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lea2;->d(Lq92;)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    iput-boolean v0, p0, Llq3;->p:Z

    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    iget-object v0, p0, Llq3;->r:Landroid/os/Handler;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, Llq3;->t:Ljq3;

    .line 30
    .line 31
    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    return-void
.end method

.method public final h()Lea2;
    .locals 0

    .line 1
    iget-object p0, p0, Llq3;->s:Lea2;

    .line 2
    .line 3
    return-object p0
.end method
