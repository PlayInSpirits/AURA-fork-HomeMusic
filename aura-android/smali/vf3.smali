.class public final Lvf3;
.super Ll2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/util/Set;
.implements Ljava/util/Collection;
.implements Lx32;


# static fields
.field public static final q:Lvf3;


# instance fields
.field public final n:Ljava/lang/Object;

.field public final o:Ljava/lang/Object;

.field public final p:Lnf3;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lvf3;

    .line 2
    .line 3
    sget-object v1, Lfz0;->Z:Lfz0;

    .line 4
    .line 5
    sget-object v2, Lnf3;->p:Lnf3;

    .line 6
    .line 7
    invoke-direct {v0, v1, v1, v2}, Lvf3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lnf3;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lvf3;->q:Lvf3;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lnf3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lvf3;->n:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lvf3;->o:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Lvf3;->p:Lnf3;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 0

    .line 1
    iget-object p0, p0, Lvf3;->p:Lnf3;

    .line 2
    .line 3
    iget p0, p0, Lnf3;->o:I

    .line 4
    .line 5
    return p0
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lvf3;->p:Lnf3;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lnf3;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    new-instance v0, Lbh1;

    .line 2
    .line 3
    iget-object v1, p0, Lvf3;->n:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, Lvf3;->p:Lnf3;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0}, Lbh1;-><init>(Ljava/lang/Object;Ljava/util/Map;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method
