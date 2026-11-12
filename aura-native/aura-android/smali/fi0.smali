.class public final Lfi0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lxs;


# static fields
.field public static final r:Lgo4;


# instance fields
.field public final n:Lmx2;

.field public final o:Lrf2;

.field public final p:I

.field public final q:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ldi0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ldi0;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lau0;->L(Lgo4;)Lgo4;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lfi0;->r:Lgo4;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Lx7;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lrf2;

    .line 5
    .line 6
    iget-object v1, p1, Lx7;->p:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Landroid/content/Context;

    .line 9
    .line 10
    invoke-direct {v0, v1}, Lrf2;-><init>(Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lfi0;->o:Lrf2;

    .line 14
    .line 15
    sget-object v0, Lfi0;->r:Lgo4;

    .line 16
    .line 17
    invoke-interface {v0}, Lgo4;->get()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lmx2;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lfi0;->n:Lmx2;

    .line 27
    .line 28
    iget p1, p1, Lx7;->o:I

    .line 29
    .line 30
    iput p1, p0, Lfi0;->p:I

    .line 31
    .line 32
    const/4 p1, 0x0

    .line 33
    iput-boolean p1, p0, Lfi0;->q:Z

    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public final g(Landroid/net/Uri;)Lic2;
    .locals 2

    .line 1
    new-instance v0, Lei0;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1, p0, p1}, Lei0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Lfi0;->n:Lmx2;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lmx2;->b(Ljava/util/concurrent/Callable;)Lic2;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final j([B)Lic2;
    .locals 2

    .line 1
    new-instance v0, Lei0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, p0, p1}, Lei0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Lfi0;->n:Lmx2;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lmx2;->b(Ljava/util/concurrent/Callable;)Lic2;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method
