.class public final Ltd;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final f:Ljava/lang/ThreadLocal;


# instance fields
.field public final a:Lyd4;

.field public final b:Ljava/util/ArrayList;

.field public final c:Lzg5;

.field public d:Lyc5;

.field public e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ltd;->f:Ljava/lang/ThreadLocal;

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
    new-instance v0, Lyd4;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Lyd4;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Ltd;->a:Lyd4;

    .line 11
    .line 12
    new-instance v0, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Ltd;->b:Ljava/util/ArrayList;

    .line 18
    .line 19
    new-instance v0, Lzg5;

    .line 20
    .line 21
    invoke-direct {v0, p0}, Lzg5;-><init>(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Ltd;->c:Lzg5;

    .line 25
    .line 26
    iput-boolean v1, p0, Ltd;->e:Z

    .line 27
    .line 28
    return-void
.end method
