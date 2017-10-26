package edu.luc.cs271.arrayqueue;

import java.util.ArrayList;
import java.util.List;

public class FixedArrayQueue<E> implements SimpleQueue<E> {

  private final int capacity;

  private int size;

  private int front;

  private int rear;

  private final E[] data;

  // DONE

  @SuppressWarnings("unchecked")
  public FixedArrayQueue(final int capacity) {
    this.capacity = capacity;
    this.data = (E[]) new Object[capacity];
    this.size = 0;
    this.front = 0;
    this.rear = capacity - 1;
  }

  @Override
  public boolean offer(final E obj) {
    // DONE
    if (size >= capacity) {
      return false;
    }
    rear = (rear + 1) % capacity;
    data[rear] = obj;
    size++;
    return true;
  }

  @Override
  public E peek() {
    // DONE
    if (isEmpty()) {
      return null;
    }
    return data[front];
  }

  @Override
  public E poll() {
    // DONE
    if (isEmpty()) {
      return null;
    }
    E result = data[front];
    front = (front + 1) % capacity;
    size--;
    return result;
  }

  @Override
  public boolean isEmpty() {
    // DONE
    if (size == 0) {
      return true;
    }
    return false;
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public List<E> asList() {
    // DONE implement using an ArrayList preallocated with the right size
    List<E> list = new ArrayList<E>(size);
    while (size != 0) {
      list.add(data[front]);
      front = (front + 1) % capacity;
      size--;
    }
    return list;
  }
}
