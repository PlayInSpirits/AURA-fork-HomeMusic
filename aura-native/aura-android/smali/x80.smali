.class public final Lx80;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lwa3;
.implements Lle0;


# static fields
.field public static final o:Li80;


# instance fields
.field public final n:Lrg1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Li80;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Li80;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lx80;->o:Li80;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lrg1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx80;->n:Lrg1;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final bridge J(Lne0;)Lne0;
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

.method public final bridge K(Lme0;)Lle0;
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

.method public final c(Ljava/lang/Integer;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lx80;->n:Lrg1;

    .line 2
    .line 3
    invoke-virtual {p0}, Lrg1;->A()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final g()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lx80;->n:Lrg1;

    .line 2
    .line 3
    iget-boolean p0, p0, Lrg1;->C:Z

    .line 4
    .line 5
    return p0
.end method

.method public final getKey()Lme0;
    .locals 0

    .line 1
    sget-object p0, Lx80;->o:Li80;

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

.method public final bridge u(Lme0;)Lne0;
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
