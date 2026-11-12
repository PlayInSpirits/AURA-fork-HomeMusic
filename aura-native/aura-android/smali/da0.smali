.class public final Lda0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lle0;


# static fields
.field public static final o:Li80;


# instance fields
.field public final n:Lgo3;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Li80;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {v0, v1}, Li80;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lda0;->o:Li80;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lgo3;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lda0;->n:Lgo3;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final J(Lne0;)Lne0;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lya4;->F(Lle0;Lne0;)Lne0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final K(Lme0;)Lle0;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lya4;->r(Lle0;Lme0;)Lle0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getKey()Lme0;
    .locals 0

    .line 1
    sget-object p0, Lda0;->o:Li80;

    .line 2
    .line 3
    return-object p0
.end method

.method public final s(Lwf1;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p1, p2, p0}, Lwf1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final u(Lme0;)Lne0;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lya4;->C(Lle0;Lme0;)Lne0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
