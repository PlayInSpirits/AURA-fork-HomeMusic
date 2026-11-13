.class final Lretrofit2/KotlinExtensions$suspendAndThrow$2$1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lretrofit2/KotlinExtensions;->suspendAndThrow(Ljava/lang/Throwable;Ldefpackage/vd0;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $continuation:Ldefpackage/vd0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldefpackage/vd0<",
            "*>;"
        }
    .end annotation
.end field

.field final synthetic $this_suspendAndThrow:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(Ldefpackage/vd0;Ljava/lang/Throwable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldefpackage/vd0<",
            "*>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lretrofit2/KotlinExtensions$suspendAndThrow$2$1;->$continuation:Ldefpackage/vd0;

    .line 2
    .line 3
    iput-object p2, p0, Lretrofit2/KotlinExtensions$suspendAndThrow$2$1;->$this_suspendAndThrow:Ljava/lang/Throwable;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lretrofit2/KotlinExtensions$suspendAndThrow$2$1;->$continuation:Ldefpackage/vd0;

    .line 2
    .line 3
    invoke-static {v0}, Ldefpackage/ya4;->x(Ldefpackage/vd0;)Ldefpackage/vd0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object p0, p0, Lretrofit2/KotlinExtensions$suspendAndThrow$2$1;->$this_suspendAndThrow:Ljava/lang/Throwable;

    .line 8
    .line 9
    invoke-static {p0}, Ldefpackage/kb4;->o(Ljava/lang/Throwable;)Ldefpackage/s14;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-interface {v0, p0}, Ldefpackage/vd0;->resumeWith(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
