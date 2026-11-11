.class public final Laf0;
.super Lpe0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final p:Laf0;

.field public static final q:Lrm0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Laf0;

    .line 2
    .line 3
    invoke-direct {v0}, Lpe0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Laf0;->p:Laf0;

    .line 7
    .line 8
    sget-object v0, Lrr0;->a:Lrm0;

    .line 9
    .line 10
    sput-object v0, Laf0;->q:Lrm0;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final W(Lne0;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object p0, Laf0;->q:Lrm0;

    .line 8
    .line 9
    invoke-virtual {p0, p1, p2}, Lrm0;->W(Lne0;Ljava/lang/Runnable;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final Y(Lne0;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, Laf0;->q:Lrm0;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    xor-int/lit8 p0, p0, 0x1

    .line 11
    .line 12
    return p0
.end method
